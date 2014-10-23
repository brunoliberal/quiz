package com.example.triviality;

public class Question {
	private int ID;
	private String QUESTION;
	private String OPTA;
	private String OPTB;
	private String OPTC;
	private String OPTD;
	private String ANSWER;
	private String CATEG;

	public Question() {
		ID = 0;
		QUESTION = "";
		OPTA = "";
		OPTB = "";
		OPTC = "";
		OPTD = "";
		ANSWER = "";
		CATEG = "";
	}

	public Question(String qUESTION, String oPTA, String oPTB, String oPTC,
			String oPTD, String aNSWER, String cATEG) {

		QUESTION = qUESTION;
		OPTA = oPTA;
		OPTB = oPTB;
		OPTC = oPTC;
		OPTD = oPTD;
		ANSWER = aNSWER;
		CATEG = cATEG;
	}

	public int getID() {
		return ID;
	}

	public String getQUESTION() {
		return QUESTION;
	}

	public String getOPTA() {
		return OPTA;
	}

	public String getOPTB() {
		return OPTB;
	}

	public String getOPTC() {
		return OPTC;
	}

	public String getOPTD() {
		return OPTD;
	}

	public String getANSWER() {
		return ANSWER;
	}

	public String getCATEG() {
		return CATEG;
	}

	public void setCATEG(String cATEG) {
		CATEG = cATEG;
	}

	public void setID(int id) {
		ID = id;
	}

	public void setQUESTION(String qUESTION) {
		QUESTION = qUESTION;
	}

	public void setOPTA(String oPTA) {
		OPTA = oPTA;
	}

	public void setOPTB(String oPTB) {
		OPTB = oPTB;
	}

	public void setOPTC(String oPTC) {
		OPTC = oPTC;
	}

	public void setOPTD(String oPTD) {
		OPTD = oPTD;
	}

	public void setANSWER(String aNSWER) {
		ANSWER = aNSWER;
	}

	@Override
	public String toString() {
		return "Pergunta: " + getQUESTION() + "\n" + "A: " + getOPTA() + "\n"
				+ "B: " + getOPTB() + "\n" + "C: " + getOPTC() + "\n" + "D: "
				+ getOPTD() + "\n" + "Resposta: " + getANSWER() + "\n"
				+ "Categoria: " + getCATEG() + "\n";
	}

}
