package assignment02;
import java.util.Set;
import java.util.HashSet;

public class Word extends Decorator {
	private String thisWord;
	public Word(Component delegate, String str) {
		super(delegate);
		thisWord = str;
	}
	
	@Override
	public Set<Character> getConsonantsInWord() {
		Set<Character>  consonants = new HashSet<Character>();

		for(char c : "bcdfghjklmnpqrstvwxz".toCharArray()) {
			consonants.add(c);
		}

		Set<Character> consonantsinthisword = new HashSet<Character>();

		for (char c : thisWord.toCharArray()){
			if(Ywords.hasYconsonant.contains(thisWord) && (c == 'y' || c == ('Y'))){
				consonantsinthisword.add(c);
			}
			if(consonants.contains(c)){
				consonantsinthisword.add(c);
			}
		}
		// return the set of characters in bcdfghjklmnpqrstvwxz 
		// which appear in thisWord
		// include y if thisWord is in Ywords.hasYconsonant
		// you may find new words that have to be addes 
		// to the file yconsonant.txt
		return consonantsinthisword;
	}
	@Override
	public Set<Character> getVowelsInWord() {

		// return the set of characters in aeiou
		// which appear in thisWord
		// include y if thisWord is in Ywords.hasYvowel
		// you may find new words that have to be addes 
		// to the file yconsonant.txt

		HashSet<Character> all_vowels = new HashSet<Character>();
		HashSet<Character> vowelSet = new HashSet<Character>();
		Character[] vowels  = {'a', 'e', 'i', 'o', 'u'};
		for(Character vowel : vowels){
			all_vowels.add(vowel); 
		}

		boolean yVowel = Ywords.hasYvowel.contains(thisWord);
		for(Character c : thisWord.toCharArray()){
			if(all_vowels.contains(c)){
				vowelSet.add(c); 
			}

			if((c.equals('y') || c.equals('Y')) && yVowel){
				vowelSet.add(c); 
			}
		}
		return vowelSet;
	}

	@Override
	public String toString() {
		return thisWord;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print("->" + this);
	}
}
