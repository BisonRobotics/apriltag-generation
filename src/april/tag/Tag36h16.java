package april.tag;

/** Tag family with 16 distinct codes.
    bits: 36,  minimum hamming: 16

    Max bits corrected       False positive rate
            0                  0.00000002 %
            1                  0.00000086 %
            2                  0.00001553 %
            3                  0.00018177 %
            4                  0.00155326 %
            5                  0.01033079 %
            6                  0.05568136 %
            7                  0.25004093 %

    Generation time: 8388.022000 s

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
      10  0
      11  0
      12  0
      13  0
      14  0
      15  0
      16  77
      17  27
      18  15
      19  1
      20  0
      21  0
      22  0
      23  0
      24  0
      25  0
      26  0
      27  0
      28  0
      29  0
      30  0
      31  0
      32  0
      33  0
      34  0
      35  0
      36  0
**/
public class Tag36h16 extends TagFamily
{
	private static class ConstructCodes0 {
		private static long[] constructCodes() {
			return new long[] { 0x5743ec549L, 0x5aecdcb0eL, 0x623ebd698L, 0xab71849fcL, 0xb69e0ef29L, 0x88027877eL, 0x82b172a0aL, 0x0cde341d1L, 0xcfca42d98L, 0x3fb426817L, 0xebba54363L, 0x2d0d69c8aL, 0xaee6ffccfL, 0x464e55c62L, 0x118c19644L, 0xdbaca746aL };
		}
	}

	private static long[] constructCodes() {
		long[] codes = new long[16];
		System.arraycopy(ConstructCodes0.constructCodes(), 0, codes, 0, 16);
		return codes;
	}

	public Tag36h16()
	{
		super(ImageLayout.Factory.createFromString("", "wwwwwwwwwwwbbbbbbbbwwbddddddbwwbddddddbwwbddddddbwwbddddddbwwbddddddbwwbddddddbwwbbbbbbbbwwwwwwwwwww"), 16, constructCodes());
	}
}

