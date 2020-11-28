public class BmiService {
    float calculate(float mass, float height) {
        float index = 10000 * mass / height / height;
        return index;
    }
}

