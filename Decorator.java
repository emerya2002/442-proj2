package assignment02;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public abstract class Decorator extends Component {
	private Component delegate;
	
	public Decorator(Component delegateIn) {
		delegate = delegateIn;
	}

	public abstract Set<Character> getConsonantsInWord();
	public abstract Set<Character> getVowelsInWord();	
	
	@Override
	public Set<Character> getConsonants() {
		Set<Character> consonants = new HashSet<>(delegate.getConsonants());
		consonants.addAll(getConsonantsInWord());
		return consonants;
	}

	@Override
	public Set<Set<Character>> getVowels() {
		Set<Set<Character>> returnVowels = new HashSet<>();
		Set<Set<Character>>  delegateVowelSet = new HashSet<>(delegate.getVowels());
		Set<Character> vowelsInWord = getVowelsInWord();
		int maxLength = 0; 
		for(Character newVowel : vowelsInWord){
			for(Set<Character> vowelSet : delegateVowelSet){

					Set<Character> newVowelSet = new HashSet<Character>(vowelSet);
					newVowelSet.add(newVowel); 	
					if(newVowelSet.size() > maxLength){
						maxLength = newVowelSet.size();
					}	
					returnVowels.add(newVowelSet);
			}
		}

		Iterator<Set<Character>> iterator = returnVowels.iterator();
        while (iterator.hasNext()) {
            Set<Character> subset = iterator.next();
            if (subset.size() < maxLength) {
                iterator.remove();
            }
        }
		return returnVowels;
	}

	@Override
	public void print() {
		delegate.print();
	}}
