package prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry implements Registry<String, Student> {
    private static StudentRegistry instance = null;

    private final Map<String, Student> registry;

    private StudentRegistry() {
        this.registry = new HashMap<>();
        fillRegistry();
    }

    public Map<String, Student> getRegistry() {
        return this.registry;
    }

    private void fillRegistry() {

        Student student = new Student();
        student.setBatch(Batch.APRIL_21_BATCH);
        student.setAverageBatchPSP(81.0f);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setIq(75);
        intelligentStudent.setBatch(Batch.APRIL_21_INTELLIGENT_BATCH);
        intelligentStudent.setAverageBatchPSP(91.0f);

        register(Batch.APRIL_21_BATCH.getValue(), student);
        register(Batch.APRIL_21_INTELLIGENT_BATCH.getValue(), intelligentStudent);
    }


    public static StudentRegistry getInstance() {
        if (instance == null) {
            synchronized (StudentRegistry.class) {
                if (instance == null) {
                    instance = new StudentRegistry();
                }
            }
        }
        return instance;
    }

    @Override
    public void register(String key, Student value) {
        registry.put(key, value);
    }

    @Override
    public Student get(String key) {
        return registry.get(key);
    }
}
