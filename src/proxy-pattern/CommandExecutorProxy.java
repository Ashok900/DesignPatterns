package proxypattern;

public class CommandExecutorProxy implements CommandExecutor{
	
	private boolean isAdmin;
	private CommandExecutor executor;
	
	

	public CommandExecutorProxy(String user, String pwd) {
		if("Ashok".equals(user)&&"password".equals(pwd))isAdmin=true;
		executor=new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin) {
			executor.runCommand(cmd);
		}else {
			if(cmd.startsWith("rm")) {
				throw new Exception("rm command not allowed for non-admin users");
			}else {
				executor.runCommand(cmd);
			}
		}
	}

}
