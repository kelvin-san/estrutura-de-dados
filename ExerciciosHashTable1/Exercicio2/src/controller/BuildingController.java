package controller;

import model.Resident;
import br.edu.fateczl.lista.listaObj.Lista;

public class BuildingController implements IBuildingController {
	
	Lista[] building;
	
	public BuildingController() {
		Lista[] building = new Lista[10];
		for (int i = 0; i < 10; i++) {
			building[i] = new Lista();
		}
		
	}

	@Override
	public void add(Resident r) throws Exception {
		int hash = r.hashCode();
		Lista l = building[hash];
		if (l.isEmpty()) {
			l.addFirst(r);
		} else {
			l.addLast(r);
		}
		
	}

	@Override
	public Resident search(Resident r) throws Exception {
		
		return null;
	}

	@Override
	public void remove(Resident r) throws Exception {
		
		
	}

	@Override
	public void list(int floor) throws Exception {
		
		
	}

}
