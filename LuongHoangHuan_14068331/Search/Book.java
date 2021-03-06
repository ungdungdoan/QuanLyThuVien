package ui;

import java.io.Serializable;
import java.util.Comparator;

public class Book implements Serializable {
	private String masach, maloai, tensach, tacgia, gia;

	public String getMasach() {
		return masach;
	}

	public void setMasach(String masach) {
		this.masach = masach;
	}

	public String getMaloai() {
		return maloai;
	}

	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public String getTacgia() {
		return tacgia;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public Book() {
	}

	public String toString() {
		return masach + ", " + maloai + ", " + tensach + ", " + tacgia;
	}

	public static Comparator<Book> BookNameComparator = new Comparator<Book>() {
		public int compare(Book b1, Book b2) {
			return b1.getTensach().compareTo(b2.getTensach());
		}
	};
}
