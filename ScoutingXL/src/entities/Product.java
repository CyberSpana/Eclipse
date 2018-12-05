package entities;

import java.util.*;

public class Product {
	
	private String ScoutName, AllianceColor, ScouterID;		
	private int TeamNumber, MatchNumber;
	private int ASwitch, AScale, CrossLine;
	private int TSwitch, TScale;
	private int Park, Climb, Foul, Card;
	
	public String getScoutName() {
		return ScoutName;
	}
	public void setScoutName(String scoutName) {
		ScoutName = scoutName;
	}
	public String getAllianceColor() {
		return AllianceColor;
	}
	public void setAllianceColor(String allianceColor) {
		AllianceColor = allianceColor;
	}
	public String getScouterID() {
		return ScouterID;
	}
	public void setScouterID(String scouterID) {
		ScouterID = scouterID;
	}
	public int getTeamNumber() {
		return TeamNumber;
	}
	public void setTeamNumber(int teamNumber) {
		TeamNumber = teamNumber;
	}
	public int getMatchNumber() {
		return MatchNumber;
	}
	public void setMatchNumber(int matchNumber) {
		MatchNumber = matchNumber;
	}
	public int getASwitch() {
		return ASwitch;
	}
	public void setASwitch(int aSwitch) {
		ASwitch = aSwitch;
	}
	public int getAScale() {
		return AScale;
	}
	public void setAScale(int aScale) {
		AScale = aScale;
	}
	public int getCrossLine() {
		return CrossLine;
	}
	public void setCrossLine(int crossLine) {
		CrossLine = crossLine;
	}
	public int getTSwitch() {
		return TSwitch;
	}
	public void setTSwitch(int tSwitch) {
		TSwitch = tSwitch;
	}
	public int getTScale() {
		return TScale;
	}
	public void setTScale(int tScale) {
		TScale = tScale;
	}
	public int getPark() {
		return Park;
	}
	public void setPark(int park) {
		Park = park;
	}
	public int getClimb() {
		return Climb;
	}
	public void setClimb(int climb) {
		Climb = climb;
	}
	public int getFoul() {
		return Foul;
	}
	public void setFoul(int foul) {
		Foul = foul;
	}
	public int getCard() {
		return Card;
	}
	public void setCard(int card) {
		Card = card;
	}
	
	public Product(String scoutName, String allianceColor, String scouterID, int teamNumber, int matchNumber,
			int aSwitch, int aScale, int crossLine, int tSwitch, int tScale, int park, int climb, int foul, int card) {
		super();
		ScoutName = scoutName;
		AllianceColor = allianceColor;
		ScouterID = scouterID;
		TeamNumber = teamNumber;
		MatchNumber = matchNumber;
		ASwitch = aSwitch;
		AScale = aScale;
		CrossLine = crossLine;
		TSwitch = tSwitch;
		TScale = tScale;
		Park = park;
		Climb = climb;
		Foul = foul;
		Card = card;
	}
	
	public Product() {
		super();
	}	
	
}
