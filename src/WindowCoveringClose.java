
public class WindowCoveringClose implements WindowCoveringsState{

	@Override
	public void windwoState(WindowCoveringContext context) {
		// TODO Auto-generated method stub
		System.out.println("Window is in closed state");
		context.setState(this);
	}
	
	
}
