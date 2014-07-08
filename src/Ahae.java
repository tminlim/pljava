public class Ahae {
	public static void main(String[] args){
		System.out.println("오감도 - 이상"+"\n"+"\n13인의 아해가 도로로 질주하오.\n(길은 막다른 골목길이 적당하오.)" + "\n");
			
		for (int i = 1; i <= 13; i++){
			if (i == 13){
				System.out.println("제" + i + "의 아해도 무섭다고 그리오."
						+ "\n13인의 아해는 무서운 아해와 무서워하는 아해와 그렇게 뿐이 모였소."
						+ "\n(다른 사정은 없는 것이 차라리 나았소)" + "\n");
				
				String adv = "무서운 ";
				String adv2 = "무서워하는 ";
				for (int j = 1; j <= 2; j++) 
					System.out.println("그중에 " + j + "인의 아해가 " + adv + "아해라도 좋소");
				for (int m = 2; m > 0; m--) 
					System.out.println("그중에 " + m + "인의 아해가 " + adv2 + "아해라도 좋소");	
				System.out.println("(길은 뚫린 골목이라도 적당하오.)" + "\n" + "\n13인의 아해가 도로로 질주하지 아니 하여도 좋소.");
			} else if ((i == 1) || (i == 11)) {
				System.out.println("제" + i + "의 아해가 무섭다고 그리오. ");
			} else if(i == 10){
				System.out.println("제" + i + "의 아해가 무섭다고 그리오. " + "\n");
			} else {
				System.out.println("제" + i + "의 아해가 무섭다고 그리오. ");
			}
		}
	}
}