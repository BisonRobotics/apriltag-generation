package april.tag;

/** Tag family with 22 distinct codes.
    bits: 25,  minimum hamming: 10

    Max bits corrected       False positive rate
            0                  0.00006557 %
            1                  0.00170469 %
            2                  0.02137423 %
            3                  0.17217398 %
            4                  1.00157261 %

    Generation time: 26.227000 s

    Hamming distance between pairs of codes (accounting for rotation):

       0  0
       1  0
       2  0
       3  0
       4  0
       5  0
       6  0
       7  0
       8  0
       9  0
      10  149
      11  36
      12  41
      13  4
      14  1
      15  0
      16  0
      17  0
      18  0
      19  0
      20  0
      21  0
      22  0
      23  0
      24  0
      25  0
**/
public class Tag25h10 extends TagFamily
{
	private static class ConstructCodes0 {
		private static long[] constructCodes() {
			return new long[] { 0x1a3d688L, 0x32dc4dL, 0x6ef361L, 0xfdf926L, 0x1c915ffL, 0x5e13dbL, 0x0b252aL, 0x1b83679L, 0x10f7b3dL, 0xe20866L, 0x1613764L, 0x1154989L, 0x1f303d0L, 0x10b86d3L, 0xaea23fL, 0x185527aL, 0xefc4a5L, 0x12a7193L, 0x5c770cL, 0xb75dc2L, 0x47a79dL, 0xacc1f2L };
		}
	}

	private static long[] constructCodes() {
		long[] codes = new long[22];
		System.arraycopy(ConstructCodes0.constructCodes(), 0, codes, 0, 22);
		return codes;
	}

	public Tag25h10()
	{
		super(ImageLayout.Factory.createFromString("", "wwwwwwwwwwbbbbbbbwwbdddddbwwbdddddbwwbdddddbwwbdddddbwwbdddddbwwbbbbbbbwwwwwwwwww"), 10, constructCodes());
	}
}

