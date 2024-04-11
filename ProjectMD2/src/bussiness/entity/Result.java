package bussiness.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Result implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int resultCount = 0;
    private int resultId;
    private int userId;
    private int examId;
    private int totalPoint;
    private LocalDateTime CreatedDate;

    public Result() {
    }

    public Result(int resultId, int userId, int examId, int totalPoint, LocalDateTime createdDate) {
        this.resultId = ++ resultCount;
        this.userId = userId;
        this.examId = examId;
        this.totalPoint = totalPoint;
        CreatedDate = createdDate;
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public LocalDateTime getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        CreatedDate = createdDate;
    }
}
