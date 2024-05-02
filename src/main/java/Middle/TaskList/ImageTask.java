package Middle.TaskList;

public class ImageTask extends AbstractTask {
    private String linkToImage;

    public ImageTask(String linkToImage) {
        this.linkToImage = linkToImage;
    }

    @Override
    public void showTask() {
        System.out.println("Отображаем картинку. Ссылка на картинку " + linkToImage);
    }

}