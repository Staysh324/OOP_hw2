package works;

class Render {
    public void showIndicator(Object object, String className) {
        if (object instanceof Health) {
            Health healthObject = (Health) object;
            System.out.println("Текущий уровень здоровья в классе " + className + ": " + healthObject.getCurrentHealthPoint() +
                    ", максимальный уровень здоровья: " + healthObject.getMaxHealthPoint());
        }

        if (object instanceof MagicEnergy) {
            MagicEnergy energyObject = (MagicEnergy) object;
            System.out.println("Текущий уровень энергии в классе " + className + ": " + energyObject.getCurrentManaPoint() +
                    ", максимальный уровень энергии: " + energyObject.getMaxManaPoint());
        }
    }
}