package yalco.sec10exception.chap03;

import yalco.sec07ClassAndReferenceType.chap04Game.MagicKnight;

public class NotEnoughManaException extends RuntimeException {
	public NotEnoughManaException(MagicKnight mk, int neededMana) {
		super(
				"마나가 %d 부족합니다."
						.formatted(neededMana - mk.mana)
		);
	}
}
