package m2i.compl.presentation;

import m2i.impl.bal.ECafe;
import m2i.impl.bal.ECafeDemo3;

public class MainWithEnum {

	public static void main(String[] args) {
		for(ECafeDemo3 currCafe : ECafeDemo3.values()){
		      if(ECafeDemo3.COURT.equals(currCafe))
		        System.out.println("Je préfère un café: " + currCafe);
		      else
		        System.out.println(currCafe);
		    }
	}
}
