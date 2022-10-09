//package org.banking.util;
//
//import jakarta.persistence.EntityManager;
//import org.university.repository.CourseRepo;
//import org.university.repository.MajorRepo;
//import org.university.repository.StudentRepo;
//import org.university.repository.TeacherRepo;
//import org.university.repository.impl.CourseRepoImpl;
//import org.university.repository.impl.MajorRepoImpl;
//import org.university.repository.impl.StudentRepoImpl;
//import org.university.repository.impl.TeacherRepoImpl;
//import org.university.service.CourseService;
//import org.university.service.MajorService;
//import org.university.service.StudentService;
//import org.university.service.TeacherService;
//import org.university.service.impl.CourseServiceImpl;
//import org.university.service.impl.MajorServiceImpl;
//import org.university.service.impl.StudentServiceImpl;
//import org.university.service.impl.TeacherServiceImpl;
//
//public class AppContext {
//
//    private final static StudentRepo STUDENT_REPO;
//    private final static TeacherRepo TEACHER_REPO;
//    private final static MajorRepo MAJOR_REPO;
//    private final static CourseRepo COURSE_REPO;
//
//    private final static StudentService STUDENT_SERVICE;
//    private final static TeacherService TEACHER_SERVICE;
//    private final static MajorService MAJOR_SERVICE;
//    private final static CourseService COURSE_SERVICE;
//
//    static {
//        EntityManager em = HibernateUtils.getEntityManagerFactory().createEntityManager();
//
//        STUDENT_REPO = new StudentRepoImpl(em);
//        TEACHER_REPO = new TeacherRepoImpl(em);
//        MAJOR_REPO = new MajorRepoImpl(em);
//        COURSE_REPO = new CourseRepoImpl(em);
//
//        STUDENT_SERVICE = new StudentServiceImpl(STUDENT_REPO);
//        TEACHER_SERVICE = new TeacherServiceImpl(TEACHER_REPO);
//        MAJOR_SERVICE = new MajorServiceImpl(MAJOR_REPO);
//        COURSE_SERVICE = new CourseServiceImpl(COURSE_REPO);
//    }
//
//    public static StudentService getStudentService() {
//        return STUDENT_SERVICE;
//    }
//
//    public static TeacherService getTeacherService() {
//        return TEACHER_SERVICE;
//    }
//
//    public static MajorService getMajorService() {
//        return MAJOR_SERVICE;
//    }
//
//    public static CourseService getCourseService() {
//        return COURSE_SERVICE;
//    }
//}