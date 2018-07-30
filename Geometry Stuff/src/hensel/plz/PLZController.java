package hensel.plz;

public class PLZController {

	PLZModelInterface model;
	PLZViewInterface view;
	
	public PLZController(PLZViewInterface view) {
		this.view = view;
		this.model = new PLZModel();
	}
	
	public void suchen() {
		
		int plz = view.getPLZ();
		String ort = model.sucheOrt(plz);
		view.setOrt(ort);
	}
	
	public void beenden() {;
		System.exit(0);
	}
	
}
