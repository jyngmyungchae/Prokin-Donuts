package common.login;

/*
    예외 처리에 사용되는 에러 발생 text를 미리 정의하는 enum 클래스입니다.
 */
public enum LoginErrorCode {
    REQUEST_NOT_FOUND("존재하지 않는 가맹점ID 입니다."),
    LOGIN_FAIL("로그인 실패"),
    MEMBERINFO_NOT_FOUND("아이디 또는 비밀번호가 올바르지 않습니다."),;


    private final String text;

    LoginErrorCode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
