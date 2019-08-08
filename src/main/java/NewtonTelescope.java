public final class NewtonTelescope extends Telescope {
    private double secondMirrorSize;

    public double getSecondMirrorSize() {
        return secondMirrorSize;
    }

    public void setSecondMirrorSize(double secondMirrorSize) throws NotPositiveNumberException {
        if (secondMirrorSize < 0) {
            throw new NotPositiveNumberException("Pozitiv kell");
        } else {
            this.secondMirrorSize = secondMirrorSize;
        }
    }

    public NewtonTelescope(double diameter, int fLength, double secondMirrorSize) throws NotPositiveNumberException {
        super(diameter, fLength);
        if (secondMirrorSize < 0) {
            throw new NotPositiveNumberException("Pozitiv kell");
        } else {
            this.secondMirrorSize = secondMirrorSize;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Second Mirror Size: " + this.secondMirrorSize;
    }

    @Override
    public boolean hasColorError() {
        return false;
    }
}
