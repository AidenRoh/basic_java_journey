package yalco.sec12dataIOandnetworking.chap06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;

public class Ex02 {

	public static void main(String[] args) throws IOException  {

		URL yalco = new URL("https://showcases.yalco.kr");
		URL home = new URL(yalco, "/java/index.html");

		//  ⭐️ 예외를 던짐
		//  Closable이 아님 : try-with-resource로는 사용되지 못함
		URLConnection conn = null;

		try {
			conn = home.openConnection();
		} catch (IOException e) {
			throw new RuntimeException();
		}

		try(
				InputStream is = conn.getInputStream();

				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				StringWriter sw = new StringWriter();
				PrintWriter pr = new PrintWriter(sw)
		) {
			String line;
			int lineCount = 1;
			while ((line = br.readLine()) != null) {
				pr.printf("%3d :  %s%n", lineCount++, line);
			}

			// ⭐️ StringWriter는 출력시 toString 생략 가능
			System.out.println(sw);
		}
	}
}
