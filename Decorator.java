package assignment02;

import java.util.HashSet;
import java.util.Set;

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
		Set<Set<Character>>  vowels = new HashSet<>(delegate.getVowels());
		vowels.add(getVowelsInWord());
		return vowels;
	}

	@Override
	public void print() {
		delegate.print();
	}}
