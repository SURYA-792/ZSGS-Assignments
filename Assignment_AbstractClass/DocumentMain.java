package Assignment_AbstractClass;

public class DocumentMain {
	public static void main(String[] args) {
		Documnt pdf = new PDFDocument("Marksheet", 2.5f);
		pdf.getType();
		pdf.getDocumentDetails();
		
		System.out.println("-----------------------------------------------");
		
		pdf = new ImageDocument("Flower", 5.5f);
		pdf.getType();
		pdf.getDocumentDetails();
		
		System.out.println("-----------------------------------------------");

		pdf = new TextDocument("Java Complete reference", 200f);
		pdf.getType();
		pdf.getDocumentDetails();
	}
}

abstract class Documnt {
	String DocumentName;
	float fileSize;

	public Documnt(String documentName, float fileSize) {
		super();
		DocumentName = documentName;
		this.fileSize = fileSize;
	}

	abstract void getType();

	void getDocumentDetails() {
		System.out.println("Document Name : " + DocumentName);
		System.out.println("Document File Size : " + fileSize+"MB");
	}
}

class PDFDocument extends Documnt {

	@Override
	void getType() {
		System.out.println("PDF Document");
	}

	PDFDocument(String name, float size) {
		super(name, size);
	}
}

class TextDocument extends Documnt {

	@Override
	void getType() {
		System.out.println("Text Document");
	}

	TextDocument(String name, float size) {
		super(name, size);
	}
}

class ImageDocument extends Documnt {

	@Override
	void getType() {
		System.out.println("Image Document");
	}

	ImageDocument(String name, float size) {
		super(name, size);
	}
}