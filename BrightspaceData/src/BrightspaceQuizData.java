import java.util.*;

public class BrightspaceQuizData {
	String name;
	int catergory;
	int questionsperpage;
	boolean paging;
	boolean shuffle;
	int desc;
	int intro;
	String descText;
	String introText;
}
class Blank{
	String answer;
	int numofanswers;
	int evaluation;
	int size;
	double weight;
}
class Match{
	String value;
	int correctChoice;
}
class Order extends Match{
	String feedback;
}
class Variable{
	String name;
	boolean scientific;
	int min;
	int minpowof10;
	int max;
	int maxpowof10;
	int decimalPlaces;
	int step;
	int steppowof10;
}
class shortAnswer{
	String answer;
	double weight;
	int evaluation;
}
class TrueOrFalse{
	boolean options[];
	String feedbackText;
	String hintText;
	String shortDescText;
	int enumerationOption; 
	String questionText;
	int choice;
	int answer;
	int points;
}
class FillInTheBlanks{
	String title;
	int points;
	int difficulty;
	int numofblanks;
	int numoftext;
	String text[];
	Blank blanks[];
}

class MultipleChoice{
	boolean options[];
	ArrayList<String>feedbackList;
	String overallFeedback;
	String hintText;
	String shortDescText;
	int enumerationOption; 
	ArrayList<Integer>weights;
	String questionText;
	ArrayList<String>choices;
	int choice;
	int answer;
	int points;
}
class MultiSelect{
	boolean options[];
	int grading;
	ArrayList<String>feedbackList;
	String overallFeedback;
	String hintText;
	String shortDescText;
	int enumerationOption; 
	String questionText;
	ArrayList<Boolean>choices;
	ArrayList<Boolean>answers;
	int points;
}
class Matching{
	int grading;
	String feedbackText;
	String hintText;
	String title;
	String questionText;
	String alternativeText;
	int points;
	int difficulty;
	int numofchoices;
	String choices[];
	Match matches[];
}
class WrittenResponse{
	boolean options[];
	boolean enableHTML;
	boolean enableImages;
	String feedbackText;
	String hintText;
	String shortDescText;
	String answerKeyText;
	int customBoxSizeChoice;
	String intialText;
	String questionText;
	int points;
}
class Ordering{
	int grading;
	String title;
	String questionText;
	String feedbackText;
	String hint;
	int points;
	int difficulty;
	int numofitems;
	Order items[];
}
class ShortAnswer{
	boolean options[];
	String overallFeedback;
	String hintText;
	String shortDescText;
	int grading;
	//Quiz Data
	String questionText;
	int points;
	ArrayList<Integer>marking;
	ArrayList<String>answers;
	
}
class Arithmetic{
	int grading;
	String title;
	String questionText;
	String alternativeText;
	boolean allowAttachments;
	int points;
	int difficulty;
	String formula;
	String precision;
	boolean enforcePrecision;
	int tolerance;
	int units;
	int percent;
	String unit;
	int worth;
	int numofvars;
	Variable variables[];
	String hintText;
	String feedbackText;
}
class SignificantFigures extends Arithmetic{
	int significantFigues;
	int deduct;
	int tolerance;
	int powof10;
}
class MultiShortAnswer{
	String title;
	int points;
	int difficulty;
	String questionText;
	String alternativeText;
	int inputBoxes;
	int rows;
	int columns;
	int numofanswer;
	ShortAnswer shortAnswers[];
	String hintText;
	String feedbackText;
}
/*
0:00 Quizzes
0:48 True/False
1:26 Fill in the Blanks
3:30 Multiple Choice
4:42 Multi-Select
6:43 Matching
8:36 Written Response
10:10 Ordering
11:28 Short Answer
12:10 Arithmetic
14:55 Significant Figures
16:10 Multi-Short Answer
*/
