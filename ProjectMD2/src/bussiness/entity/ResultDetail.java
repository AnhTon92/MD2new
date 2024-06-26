package bussiness.entity;

import java.io.Serializable;

public class ResultDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int resultCount= 0;
    private int resultId;
    private int indexQuestion;
    private int indexChoice;
    private boolean check;

    public ResultDetail() {
    }

    public ResultDetail(int resultId, int indexQuestion, int indexChoice, boolean check) {
        this.resultId = ++resultCount;
        this.indexQuestion = indexQuestion;
        this.indexChoice = indexChoice;
        this.check = check;
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getIndexQuestion() {
        return indexQuestion;
    }

    public void setIndexQuestion(int indexQuestion) {
        this.indexQuestion = indexQuestion;
    }

    public int getIndexChoice() {
        return indexChoice;
    }

    public void setIndexChoice(int indexChoice) {
        this.indexChoice = indexChoice;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
