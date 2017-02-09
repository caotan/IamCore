package fr.epita.iam.tests;

import fr.epita.iam.datamodel.Identity;

public class TestId {

	public static void main(String[] args)
	{
		Identity identity = new Identity("0","Ngoc Tan Cao", "caotan10@gmail.com","71 Rue de la Mare");
		System.out.print(identity);
	}
}
