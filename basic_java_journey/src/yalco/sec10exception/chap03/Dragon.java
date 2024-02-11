package yalco.sec10exception.chap03;

import yalco.sec07ClassAndReferenceType.chap04.Side;
import yalco.sec07ClassAndReferenceType.chap04.Unit;

class Dragon extends Unit {
	public Dragon(Side side) {
		super(side, 3000);
	}

	@Override
	public String toString() {
		return side.toString() + " 진영 드래곤";
	}
}