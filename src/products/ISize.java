package products;

public interface ISize {
	String getTheSize();
	Boolean checkIfTheSizeIsCorrect(String size);
	Boolean checkIfTheSizeIsCorrect(Integer size);
}
