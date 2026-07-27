public class Member extends User {
    private SearchHistory[] searchHistory;

    public Member(String username, String password, SearchHistory[] searchHistory) {
        super(username, password);
        this.history = history;
    }

    public SearchHistory getSearchHistory() {
        return searchHistory;
    }

    public void setSearchHistory(SearchHistory searchHistory) {
        this.searchHistory = searchHistory;
    }

    @Override
    public String getRole(){
        return "Member";
    }
}
