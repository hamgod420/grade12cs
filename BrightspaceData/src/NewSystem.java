import java.util.*;

public class NewSystem {

}
//Entities
class OptionList{
	int selected;
}
class Question{
	boolean attributesUsed[];//At index i if true means that attribute is being used in the question
	
	String title;
	String shortDescription;
	String questionText;
	String alternativeText;
	String hint;
	String overallFeedback;
	String answerKey;
	
	int points;
	int difficulty;
	
	OptionList optionlist;
	MultipleButtonList grading;
	//Values can be null
}
class MultipleButtonList{
	int selected;
}
class MultipleSelectionList{
	ArrayList<Integer>selections;
}

//Classes
class Choice{
	int weights;
	String choiceText;
	String feedback;
}
class Blanks{
	int numofanswers;
	String answers[];
	int weight;
	MultipleButtonList evalution;
}
class Match{
	int index;
	String value;
}
class MatchAnswer extends Match{
	int answer;
}
class Order extends MatchAnswer{
	String feedback;
}
class Variable{
	boolean sigfig;
	int index;
	int min;
	int max;
	MultipleButtonList decimalPlaces;
	int step;
	int min10;
	int max10;
	int step10;
}
//Questions
class FillInTheBlank extends Question{
	int numofblank;
	int numoftexts;
	Blanks blanks[];
	String texts[];
}
class MultipleChoice extends Question{
	ArrayList<Choice>multipleChoices;
	MultipleButtonList choice;
	MultipleButtonList enumeration;
	boolean randomize;
}
class MutlipleSelection extends Question{
	ArrayList<Choice>multipleSelections;
	MultipleSelectionList selections;
	MultipleButtonList enumeration;
	boolean randomize;
}
class Matching extends Question{
	int numofchoices;
	int numofmatches;
	Match choices[];
	MatchAnswer matches[];
}
class WrittenResponse extends Question{
	String intialText;
	boolean enableHTML;
	boolean enableAttachments;
	MultipleButtonList boxsize;
}
class Ordering extends Question{
	int numoforders;
	Order orders[];
}
class ShortAnswer extends Question{
	ArrayList<Blank>blanks;//variables not used can be null\
	MultipleButtonList pointassignment;
}
class Arithmetic extends Question{
	boolean allowAttachments;
	String formula;
	MultipleButtonList precision;
	boolean enforcePrecision;
	boolean units;
	boolean percentage;
	int unit;
	int percent;
	int value;
	MultipleButtonList percentageOfPoints;
	MultipleButtonList evaluation;	
	int numofvars;
	Variable vars[];
}
class SignificantFigures extends Arithmetic{
	MultipleButtonList sigfigs;
	MultipleButtonList deduct;
	boolean tolerance;
	int unit10;
}
class MultiShortAnswer extends ShortAnswer{
	int inputboxes;
	MultipleButtonList rows;
	MultipleButtonList column;
	MultipleButtonList evaluation;
}
