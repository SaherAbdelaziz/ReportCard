package com.reportcard.reportcard;


public class ReportCard{

    private int mStudentID;
    private String mStudentName;
    private String mChemistryGrade ;
    private String mEnglishGrade ;
    private String mMathGrade ;
    private String mHistoryGrade ;
    private String mBiologyGrade ;


    public ReportCard(int StudentID, String StudentName) {
        this.mStudentID = StudentID;
        this.mStudentName = StudentName;
    }

    public ReportCard(int StudentID, String StudentName , String ChemistryGrade , String EnglishGrade ,
                      String MathGrade , String HistoryGrade , String BiologyGrade) {
        this.mStudentID = StudentID;
        this.mStudentName = StudentName;
        this.mChemistryGrade = ChemistryGrade ;
        this.mEnglishGrade = EnglishGrade ;
        this.mMathGrade = MathGrade ;
        this.mHistoryGrade = HistoryGrade ;
        this.mBiologyGrade = BiologyGrade ;
    }

    public int getStudentID() {
        return mStudentID;
    }

    public void setStudentID(int id) {
        mStudentID = id;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String name) {
        mStudentName = name;
    }

    public String getChemistryGrade() {
        return mChemistryGrade;
    }

    public void setChemistryGrade(String ChemistryGrade) {
        mChemistryGrade = ChemistryGrade;
    }

    public String getEnglishGrade() {
        return mEnglishGrade;
    }

    public void setEnglishGrade(String EnglishGrade) {
        mEnglishGrade = EnglishGrade;
    }

    public String getMathGrade() {
        return mMathGrade;
    }

    public void setMathGrade(String MathGrade) {
        mMathGrade = MathGrade;
    }

    public String getHistoryGrade() {
        return mHistoryGrade;
    }

    public void setHistoryGrade(String HistoryGrade) {
        mHistoryGrade = HistoryGrade;
    }

    public String getBiologyGrade() {
        return mBiologyGrade;
    }

    public void setBiologyGrade(String BiologyGrade) {
        mStudentName = BiologyGrade;
    }

    @Override
    public String toString() {
        return "Student ID " + mStudentID +" Student Name " + mStudentName + " ChemistryGrade " + mChemistryGrade
                + " EnglishGrade " + mEnglishGrade + " MathGrade " + mMathGrade + " HistoryGrade " + mHistoryGrade
                + " BiologyGrade " + mBiologyGrade ;
    }

}
