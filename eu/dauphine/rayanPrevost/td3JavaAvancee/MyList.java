package eu.dauphine.rayanPrevost.td3JavaAvancee;


public class MyList {
	private Cell premiereCellule;

	/**
	 * Méthode add(String) ajoutant une cellule contenant la String en parametre en tête de liste.
	 * @param string
	 */
	public void add(String string) {
		if(string == null) {
			throw new NullPointerException();
		}
		Cell ancienPremier = premiereCellule;
		premiereCellule = new Cell(string,ancienPremier);
	}
	
	/**
	 * Méthode permettant de savoir si la liste est vide
	 * @return true si elle est vide, false sinon
	 */
	public boolean isVide() {
		boolean res = false;
		if(this.premiereCellule == null) {
			res = true;
		}
		return res;
	}
	/**
	 * Méthode size() permettant de connaître la taille de la liste.
	 * @return taille qui corresponds à la taille de la liste.
	 */
	public int size() {
		int taille = 0;
		
		Cell reference = getPremiereCellule();
		
		while (reference != null) {
			taille ++;
			reference = reference.getCelluleSuivante();
		}
		
		return taille;
	}

	/**
	 * Méthode permettant l'affiche des éléments de la liste chain
	 */
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
	
	/**
	 * Méthode retournant la dernier cellule de la liste
	 * @return
	 */
	public Cell getDernierElement() {
		Cell dernier = this.premiereCellule;
		while (dernier.getCelluleSuivante() != null) {
			dernier= dernier.getCelluleSuivante();
		}
		return dernier;
	}
	
	/**
	 * Méthode permettant l'ajout de l'élément celle à la fin de la liste.
	 */
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

	/**
	 * Méthode permettant d'ajouter une cellule apres la cellule d'indice indice de la liste
	 * @param contenue String representant le contenue de la cellule 
	 * @param indice Int representant l'indice de la cellule apres laquel on souhaite insérer la nouvelle cellule
	 */
	public void add(String contenu, int indice) {
		Cell cellBefore = this.getCellule(indice);
		Cell cellAfter = this.getCellule(indice+1);
		
		Cell cell = new Cell();
		
		cellBefore.setCelluleSuivante(cell);
		
		cell.setContenu(contenu);
		cell.setCelluleSuivante(cellAfter);
	}
	
	/**
	 * Méthode retournant le contenue de la cellule selon son indice
	 * retourne une erreur de type IllegalArgumentException si l'indice est plus grand que la taille de la liste ou inférieru à zéro
	 * @param index Indice de la cellule pour laquel on souhaite connaitre son contenu
	 * @return
	 */
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

	/**
	 * Cette méthode permet de retourner la cellule presente à un indice precis.
	 * retourne une erreur de type IllegalArgumentException si l'indice est plus grand que la taille de la liste ou inférieru à zéro
	 * @param index
	 * @return
	 */
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
	
	
	/**
	 * Getters pour connaitre la premiere cellule de la liste
	 * @return
	 */
	public Cell getPremiereCellule() {
		return premiereCellule;
	}

	/** 
	 * Setter pour mettre une Cell en tant que premiere Cellule
	 * @param premiereCellule
	 */
	public void setPremiereCellule(Cell premiereCellule) {
		this.premiereCellule = premiereCellule;
	}
	
	/**
	 * Méthode renvoyant la somme des lettres contenues dans la liste
	 * @return
	 */
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
