package eu.dauphine.rayanPrevost.td3JavaAvancee;

/*
public class MyList {
	private Cell premiereCellule;

	
	public void add(String string) {
		if(string == null) {
			throw new NullPointerException();
		}
		Cell ancienPremier = premiereCellule;
		premiereCellule = new Cell(string,ancienPremier);
	}
	

	public boolean isVide() {
		boolean res = false;
		if(this.premiereCellule == null) {
			res = true;
		}
		return res;
	}

	public int size() {
		int taille = 0;
		
		Cell reference = getPremiereCellule();
		
		while (reference != null) {
			taille ++;
			reference = reference.getCelluleSuivante();
		}
		
		return taille;
	}

	@Override
	public String toString() {
		String res = "";
		Cell cellule = premiereCellule;
		
		for (int i = 0; i < size(); i++) {
			if(cellule == this.getDernierElement()) {
				res += cellule.getContenu()+"";
			}else {
				res += cellule.getContenu()+", ";	
			}
			cellule = cellule.getCelluleSuivante();
		}
		
		return res;
	}
	

	public Cell getDernierElement() {
		Cell dernier = this.premiereCellule;
		while (dernier.getCelluleSuivante() != null) {
			dernier= dernier.getCelluleSuivante();
		}
		return dernier;
	}
	

	public void addLast(String contenu) {
		if(this.isVide()) {
			this.premiereCellule = new Cell();
			this.premiereCellule.setContenu(contenu);
		} else {
			
			Cell dernier = getDernierElement();
			Cell cell = new Cell();
			cell.setContenu(contenu);
			dernier.setCelluleSuivante(cell);	
		}	
		
	}


	public void add(String contenu, int indice) {
		Cell cellBefore = this.getCellule(indice);
		Cell cellAfter = this.getCellule(indice+1);
		
		Cell cell = new Cell();
		
		cellBefore.setCelluleSuivante(cell);
		
		cell.setContenu(contenu);
		cell.setCelluleSuivante(cellAfter);
	}
	

	public String get(int index) {
		String res = "";
		Cell cellule = this.premiereCellule;
		int i = 0;
		if(index >=size() || index < 0) {
			throw new IllegalArgumentException("Out of bounds");
		}else {
			while ( i < size()) {		
				if( i == index) {
					res = cellule.getContenu();
				}
				cellule = cellule.getCelluleSuivante();
				i++;
			}	
		}
		return res;
	}

	public Cell getCellule(int index) {	
		Cell res = new Cell();
		Cell cellule = this.premiereCellule;
		int i = 0;
		if(index >=size() || index < 0) {
			throw new IllegalArgumentException("Out of bounds");
		}else {
			while ( i < size()) {		
				if( i == index) {
					res = cellule;
				}
				cellule = cellule.getCelluleSuivante();
				i++;
			}	
		}
		return res;
				
	}
	
	

	public Cell getPremiereCellule() {
		return premiereCellule;
	}

	
	public void setPremiereCellule(Cell premiereCellule) {
		this.premiereCellule = premiereCellule;
	}
	
	
	public int sumLetter() {
		int res = 0; 
		Cell cellule = this.premiereCellule;
		for (int i = 0; i < size(); i++) {
			//System.out.println(cellule.getSizeContenu());
			res += cellule.getContenu().chars().count();	
			cellule = cellule.getCelluleSuivante();	
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		MyList list = new MyList();
		
		list.addLast("totoo");
		list.add("toto");
		list.add("titi");
		//System.out.println(list.size());
		System.out.println(list.toString());
		//System.out.println(list.sumLetter());
		try{
		
		System.out.println(list.get(2));
		System.out.println(list.getCellule(-1));
		System.out.println(list.getCellule(0));
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
			
	}
}
*/

public class MyList<T> {
	private Cell<T> premiereCellule;
	private static int taille;
	
    public MyList(Cell<T> first) {
        this.premiereCellule = first;
    }

   
    public MyList() {
    }
    
	public void add(T contenu) {
		taille++;
		if(premiereCellule == null) {
			throw new NullPointerException();
		}
		Cell<T> ancienPremier = premiereCellule;
		premiereCellule = new Cell<T>(contenu);
		premiereCellule.setCelluleSuivante(ancienPremier);
		
	}
	
	public int size() {
		return taille;
	}
	
	public boolean isVide() {
		boolean res = false;
		if(this.premiereCellule == null) {
			res = true;
		}
		return res;
	}
	
	@Override
	public String toString() {
		String res = "";
		Cell<T> cellule = premiereCellule;
		
		for (int i = 0; i < size(); i++) {
			if(cellule == this.getDernierElement()) {
				res += cellule.getContenu()+"";
			}else {
				res += cellule.getContenu()+", ";	
			}
			cellule = cellule.getCelluleSuivante();
		}
		
		return res;
	}
	

	public Cell<T> getDernierElement() {
		Cell<T> dernier = this.premiereCellule;
		while (dernier.getCelluleSuivante() != null) {
			dernier= dernier.getCelluleSuivante();
		}
		return dernier;
	}
	

	public void addLast(T contenu) {
		if(this.isVide()) {
			this.premiereCellule = new Cell<T>();
			this.premiereCellule.setContenu(contenu);
		} else {
			
			Cell<T> dernier = getDernierElement();
			Cell<T> cell = new Cell<T>();
			cell.setContenu(contenu);
			dernier.setCelluleSuivante(cell);	
		}	
		
	}
	
	
	public void add(T contenu, int indice) {
		Cell<T> cellBefore = this.getCellule(indice);
		Cell<T> cellAfter = this.getCellule(indice+1);
		
		Cell<T> cell = new Cell<T>();
		
		cellBefore.setCelluleSuivante(cell);
		
		cell.setContenu(contenu);
		cell.setCelluleSuivante(cellAfter);
	}
	

	public T get(int index) {
		T res = null;
		Cell<T> cellule = this.premiereCellule;
		int i = 0;
		if(index >=size() || index < 0) {
			throw new IllegalArgumentException("Out of bounds");
		}else {
			while ( i < size()) {		
				if( i == index) {
					res = cellule.getContenu();
				}
				cellule = cellule.getCelluleSuivante();
				i++;
			}	
		}
		return res;
	}

	public Cell<T> getCellule(int index) {	
		Cell<T> res = new Cell<T>();
		Cell<T> cellule = this.premiereCellule;
		int i = 0;
		if(index >=size() || index < 0) {
			throw new IllegalArgumentException("Out of bounds");
		}else {
			while ( i < size()) {		
				if( i == index) {
					res = cellule;
				}
				cellule = cellule.getCelluleSuivante();
				i++;
			}	
		}
		return res;
				
	}
	
	

	public Cell<T> getPremiereCellule() {
		return premiereCellule;
	}

	
	public void setPremiereCellule(Cell<T> premiereCellule) {
		this.premiereCellule = premiereCellule;
	}
	
	
	public int sumLetter() {
		int res = 0; 
		Cell<T> cellule = this.premiereCellule;
		for (int i = 0; i < size(); i++) {
			//System.out.println(cellule.getSizeContenu());
			res += cellule.getContenu().toString().length();	
			cellule = cellule.getCelluleSuivante();	
		}
		return res;
	}

	public boolean contains(T value) {
		boolean res = false;
		Cell<T> premiereCellule = this.premiereCellule;
		
		while(premiereCellule != null) {
			if(premiereCellule.getContenu().equals(value)) {
				res = true;
				premiereCellule = premiereCellule.getCelluleSuivante();
			}
		}
		return res;
	}

	
	public static void main(String[] args) {
		MyList<Object> list = new MyList<Object>();

        Object tatu = new Object();
        Object toto = new Object();
        Object titi = new Object();
        Object tutu = new Object();

        list.addLast(tatu);
        list.add(toto);
        list.add(tutu);
        
        
        System.out.println(list.toString());
        

        System.out.println(list.size());
        //System.out.println("List contains titi : " + m.contains(titi));
        //System.out.println("Sumletters : " + m.sumLetter());
	}

}

