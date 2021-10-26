package eu.dauphine.rayanPrevost.td3JavaAvancee;

public class Cell {
	private String contenu;
	private Cell celluleSuivante;
	
	/**
	 * Constructeur d'une cellule
	 * @param contenu de la cellule
	 * @param celluleSuivante, réference vers le maillon suivant de la liste
	 */
	public Cell(String contenu, Cell celluleSuivante) {
		this.contenu = contenu;
		this.celluleSuivante = celluleSuivante;
	}
	
	public Cell() {
		
	}
	


	/**
	 * Getters pour avoir le contenu de la cellule 
	 * @return
	 */
	public String getContenu() {
		return contenu;
	}
	
	/**
	 * Setters pour le contenu de la cellule
	 * @param contenu
	 */
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	/**
	 * Getter sur la cellule suivante
	 * @return
	 */
	public Cell getCelluleSuivante() {
		return celluleSuivante;
	}
	
	/**
	 * Setter sur la réference de la cellule suivante
	 * @param celluleSuivante
	 */
	public void setCelluleSuivante(Cell celluleSuivante) {
		this.celluleSuivante = celluleSuivante;
	}
	public int getSizeContenu() {
		return this.contenu.length();
	}

}
