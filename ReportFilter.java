package report_history;

import java.util.List;
import java.util.stream.Collectors;

public class ReportFilter {

    public List<Report> reportFilter(List<Report> reports, String studentUserName, int count) {
        List<Report> filter = reports.stream()
                .filter(s -> s.getStudentUserName().contains(studentUserName))
                .limit(count)
                .sorted()
                .collect(Collectors.toList());

        return filter;
    }
}
