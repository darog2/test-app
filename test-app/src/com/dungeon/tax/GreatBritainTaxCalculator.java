package com.dungeon.tax;

public class GreatBritainTaxCalculator implements TaxCalculator {

    private final double nds = .195;
    private final double pensFond = .04;
    private final double socialFond = .015;
    private final double wineForQueenFond = .07;
    private final double progressiveBefore = .17;
    private final double progressiveAfter = .34;
    private final double progressiveEdge = 10_000;

    @Override
    public double calculateTax(double sum) {
        double ndsForSum = sum*nds;
        double pensForSum = sum*pensFond;
        double socialForSum = sum*socialFond;
        double wineForSum = sum*wineForQueenFond;
        double progressiveForSum = progressive(sum);

        double totalTax=ndsForSum+pensForSum+socialForSum+progressiveForSum+wineForSum;
        return totalTax;
    }
    public double progressive(double sum){
        if(progressiveEdge<sum) {
            return sum*progressiveAfter;
        } else {
            return sum*progressiveBefore;
        }
    }
}
