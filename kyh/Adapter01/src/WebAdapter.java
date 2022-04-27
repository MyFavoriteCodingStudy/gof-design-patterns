public class WebAdapter implements WebRequester {
    private FancyRequester fancyRequester;

    public WebAdapter(FancyRequester fancyRequester) {
        this.fancyRequester = fancyRequester;
    }

    @Override
    public void requestHandler() {
        fancyRequester.fancyRequestHandler();
    }
}
