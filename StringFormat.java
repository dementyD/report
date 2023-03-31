package report_history;

import java.util.List;

public class StringFormat {

    public String stringFormat(List<Report> report) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Report list : report) {
            stringBuilder.append(list.getStudentUserName() + "\n" + list.getDate() + "\n" + list.getHours() + "\n"
                    + list.getTitle() + "\n" + "-----------------" + "\n");
        }
        return stringBuilder.toString();
    }
}
