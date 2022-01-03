package poly.player;

public class Warrior extends Player {

	int rage;
	
	Warrior(String name) {
		super(name);
		this.rage = 60;
	}

	public void rush(Player pl) {
		/*
	       1. rush라는 기술을 사용하는 사람의 이름을 
	        적절한 키워드를 사용하여 출력해 주세요.
	        
	       2. 이 기술을 맞는 사람의 피해량을 출력해 주세요.
	        전사는 10의 피해, 마법사는 20의 피해, 사냥꾼은 15의 피해를
	        각각 입습니다.
	        
	       3. 직업별로 다른 피해량을 instanceof 키워드를 사용하여
	        구분해서 출력해 주세요.
	        
	       4. 남은 체력들도 마찬가지로 출력해 주세요.
	       */
	
		System.out.printf("%s님이 %s님에게 돌진을 시전했습니다\n"
				, this.name, pl.name);
		if(pl instanceof Warrior) {
			pl.hp = pl.hp - 10;// pl.hp -= 10
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다\n%s님의 남은 체력: %d\n"
					, pl.name, pl.name, pl.hp );
		} else if(pl instanceof Mage) {
			pl.hp = pl.hp - 20; // pl.hp -= 20
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다\n%s님의 남은 체력: %d\n"
					, pl.name, pl.name, pl.hp );
		} else if(pl instanceof Hunter) {
			pl.hp = pl.hp - 15; // pl.hp -= 15 
			System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다\n%s님의 남은 체력: %d\n"
					, pl.name, pl.name, pl.hp );
		}
	
//		System.out.printf("%s님의 남은 체력: %d\n"
//				,pl.name ,pl.hp);
	    System.out.println("-----------------------------------");
	
	
	
	
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}


	
}












