
public class WindowCoveringOpen implements WindowCoveringsState {

	@Override
	public void windwoState(WindowCoveringContext context) {
		// TODO Auto-generated method stub
		System.out.println("Window is in opened state");
		context.setState(this);
	}
	
	
	

}
