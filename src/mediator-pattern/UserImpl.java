package mediatorPattern;

public class UserImpl extends User{

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name+": Sending Message="+msg);
	}

	@Override
	public void recieve(String msg) {
		System.out.println(this.name+": Recived Message:"+msg);
	}

}
