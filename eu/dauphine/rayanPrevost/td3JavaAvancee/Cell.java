package eu.dauphine.rayanPrevost.td3JavaAvancee;

/*
public class Cell {
	private String contenu;
	private Cell celluleSuivante;

	public Cell(String contenu, Cell celluleSuivante) {
		this.contenu = contenu;
		this.celluleSuivante = celluleSuivante;
	}
	
	public Cell() {
		
	}
	public String getContenu() {
		return contenu;
	}
	

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	

	public Cell getCelluleSuivante() {
		return celluleSuivante;
	}
	

	public void setCelluleSuivante(Cell celluleSuivante) {
		this.celluleSuivante = celluleSuivante;
	}
	public int getSizeContenu() {
		return this.contenu.length();
	}

}*/

public class Cell<T>{
	
	private T contenu;
	private Cell<T> celluleSuivante;
	
	public Cell(T contenu) {
		this.contenu = contenu;
	}
	public Cell() {
		
	}

	public T getContenu() {
		return contenu;
	}

	public void setContenu(T contenu) {
		this.contenu = contenu;
	}

	public Cell<T> getCelluleSuivante() {
		return celluleSuivante;
	}

	public void setCelluleSuivante(Cell<T> celluleSuivante) {
		this.celluleSuivante = celluleSuivante;
	}
	
}
