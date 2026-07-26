public class Member extends User {
    private SearchHistory searchHistory;

    public Member(String username, String password) {
        super(username, password);
    }

    public SearchHistory getSearchHistory() {
        return searchHistory;
    }

    public void setSearchHistory(SearchHistory searchHistory) {
        this.searchHistory = searchHistory;
    }
}