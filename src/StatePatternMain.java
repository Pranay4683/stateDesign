
public class StatePatternMain {
	public static void main(String[] args) {
		WindowCoveringContext context = new WindowCoveringContext();
		
		
		WindowCoveringOpen coveringOpen = new WindowCoveringOpen();
		System.out.println("Open State");
		coveringOpen.windwoState(context);
		
		WindowCoveringClose coveringClose = new WindowCoveringClose();
		System.out.println("Close State");
		coveringClose.windwoState(context);
		
	}
}
