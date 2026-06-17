package com.keenant.madgrades;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Constants {
  /** columns for PDFs at https://registrar.wisc.edu/grade-reports/ */
  public static final List<Float> GRADES_COLUMNS = IntStream.of(
      201, 217, 253, 280, 305, 332, 358, 384, 407, 433,
      457, 482, 508, 532, 559, 584, 608, 633, 659, 680).mapToObj(i -> (float) i).collect(Collectors.toList());

  /** columns for "Final DIR" PDF's https://registrar.wisc.edu/current-reports/ */
  public static final List<Float> DIR_COLUMNS = IntStream.of(
      52, 76, 105, 129, 149, 212, 300, 365, 430, 485, 549).mapToObj(i -> (float) i).collect(Collectors.toList());

  /** columns for "Final DIR" PDF's specifically for 1124 */
  public static final List<Float> DIR_COLUMNS_1124 = IntStream.of(
      57, 80, 99, 123, 124, 250, 389, 437, 488, 526, 578).mapToObj(i -> (float) i).collect(Collectors.toList());

  /** columns for "Final DIR" PDF's since 1204 */
  public static final List<Float> DIR_COLUMNS_SINCE_1204 = IntStream.of(
      63, 90, 126, 158, 194, 252, 378, 450, 486, 518, 581).mapToObj(i -> (float) i).collect(Collectors.toList());

  /** day abbreviation/character to day of week enum */
  public static final Map<String, DayOfWeek> STR_TO_DAY = new HashMap<String, DayOfWeek>() {
    {
      put("M", DayOfWeek.MONDAY);
      put("T", DayOfWeek.TUESDAY);
      put("W", DayOfWeek.WEDNESDAY);
      put("R", DayOfWeek.THURSDAY);
      put("F", DayOfWeek.FRIDAY);
      put("S", DayOfWeek.SATURDAY);
      put("N", DayOfWeek.SUNDAY);
    }
  };

  public static final Map<DayOfWeek, String> DAY_TO_STR = STR_TO_DAY.entrySet().stream()
      .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

  /** page which hosts links to a few schedules */
  public static final String SCHEDULES_URL = "https://registrar.wisc.edu/schedule-of-classes-faculty/";
}
