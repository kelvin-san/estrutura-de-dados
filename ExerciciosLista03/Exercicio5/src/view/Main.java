package view;

import controller.EditRegisterController;

public class Main {

	public static void main(String[] args) throws Exception {
		EditRegisterController ctrl = new EditRegisterController();
		
		ctrl.newRegister(41, 60, 8000.0);
		ctrl.newRegister(31, 40, 5000.0);
		ctrl.newRegister(21, 30, 3000.0);
		
	}

}
