package chainofresponsibilityPattern;

public interface DispenceChain {
	public void setNextChain(DispenceChain nextChain);
	void dispense(Currency cur);

}
