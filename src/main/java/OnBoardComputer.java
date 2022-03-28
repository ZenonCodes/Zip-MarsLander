public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int altitude = status.getAltitude();
        int velocity = status.getVelocity();
        int burn = ((velocity*velocity) / (2 * altitude))+99;

        System.out.println("AAAA" + burn); /*hack!*/
        return burn;
    }

}
