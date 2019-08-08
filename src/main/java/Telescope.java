public abstract class Telescope {
    private double diameter;
    private int fLength;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) throws NotPositiveNumberException {
        if (diameter < 0) {
            throw new NotPositiveNumberException("Pozitiv kell");
        } else {
            this.diameter = diameter;
        }
    }

    public int getfLength() {
        return fLength;
    }

    public void setfLength(int fLength) throws NotPositiveNumberException {
        if (fLength < 0) {
            throw new NotPositiveNumberException("Pozitiv kell");
        } else {
            this.fLength = fLength;
        }
    }

    public Telescope(double diameter, int fLength) {
        if (fLength < 0) {
            throw new NotPositiveNumberException("Pozitiv kell");
        } else {
            this.fLength = fLength;
        }
        if (diameter < 0) {
            throw new NotPositiveNumberException("Pozitiv kell");
        } else {
            this.diameter = diameter;
        }
    }

    @Override
    public String toString() {
        return "Telescope{" +
                "diameter=" + diameter +
                ", fLength=" + fLength +
                '}';
    }

    public abstract boolean hasColorError();
}
