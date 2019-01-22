package april.tag;

/** Tag family with 17 distinct codes.
    bits: 16,  minimum hamming: 6

    Max bits corrected       False positive rate
            0                  0.02593994 %
            1                  0.44097900 %
            2                  3.55377197 %

    Generation time: 0.172000 s

    Hamming distance between pairs of codes (accounting for rotation):

       0  0
       1  0
       2  0
       3  0
       4  0
       5  0
       6  108
       7  0
       8  28
       9  0
      10  0
      11  0
      12  0
      13  0
      14  0
      15  0
      16  0
**/
public class Tag16h6 extends TagFamily
{
	private static class ConstructCodes0 {
		private static long[] constructCodes() {
			return new long[] { 0x81ecL, 0x8d76L, 0xaa4fL, 0xb014L, 0xbb9eL, 0x743eL, 0x4d58L, 0x58e2L, 0x65e9L, 0x9b53L, 0xd0bdL, 0x33a8L, 0x6b36L, 0xdc71L, 0x46fcL, 0xa7b4L, 0x1a2eL };
		}
	}

	private static long[] constructCodes() {
		long[] codes = new long[17];
		System.arraycopy(ConstructCodes0.constructCodes(), 0, codes, 0, 17);
		return codes;
	}

	public Tag16h6()
	{
		super(ImageLayout.Factory.createFromString("", "wwwwwwwwwbbbbbbwwbddddbwwbddddbwwbddddbwwbddddbwwbbbbbbwwwwwwwww"), 6, constructCodes());
	}
}

