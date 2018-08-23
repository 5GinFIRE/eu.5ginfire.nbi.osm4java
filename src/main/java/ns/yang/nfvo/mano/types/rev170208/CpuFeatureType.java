package ns.yang.nfvo.mano.types.rev170208;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum CpuFeatureType implements Enumeration {
    PREFERAES(0, "PREFER_AES"),
    
    REQUIREAES(1, "REQUIRE_AES"),
    
    PREFERCAT(2, "PREFER_CAT"),
    
    REQUIRECAT(3, "REQUIRE_CAT"),
    
    PREFERCMT(4, "PREFER_CMT"),
    
    REQUIRECMT(5, "REQUIRE_CMT"),
    
    PREFERDDIO(6, "PREFER_DDIO"),
    
    REQUIREDDIO(7, "REQUIRE_DDIO"),
    
    REQUIREVME(8, "REQUIRE_VME"),
    
    PREFERVME(9, "PREFER_VME"),
    
    REQUIREDE(10, "REQUIRE_DE"),
    
    PREFERDE(11, "PREFER_DE"),
    
    REQUIREPSE(12, "REQUIRE_PSE"),
    
    PREFERPSE(13, "PREFER_PSE"),
    
    REQUIRETSC(14, "REQUIRE_TSC"),
    
    PREFERTSC(15, "PREFER_TSC"),
    
    REQUIREMSR(16, "REQUIRE_MSR"),
    
    PREFERMSR(17, "PREFER_MSR"),
    
    REQUIREPAE(18, "REQUIRE_PAE"),
    
    PREFERPAE(19, "PREFER_PAE"),
    
    REQUIREMCE(20, "REQUIRE_MCE"),
    
    PREFERMCE(21, "PREFER_MCE"),
    
    REQUIRECX8(22, "REQUIRE_CX8"),
    
    PREFERCX8(23, "PREFER_CX8"),
    
    REQUIREAPIC(24, "REQUIRE_APIC"),
    
    PREFERAPIC(25, "PREFER_APIC"),
    
    REQUIRESEP(26, "REQUIRE_SEP"),
    
    PREFERSEP(27, "PREFER_SEP"),
    
    REQUIREMTRR(28, "REQUIRE_MTRR"),
    
    PREFERMTRR(29, "PREFER_MTRR"),
    
    REQUIREPGE(30, "REQUIRE_PGE"),
    
    PREFERPGE(31, "PREFER_PGE"),
    
    REQUIREMCA(32, "REQUIRE_MCA"),
    
    PREFERMCA(33, "PREFER_MCA"),
    
    REQUIRECMOV(34, "REQUIRE_CMOV"),
    
    PREFERCMOV(35, "PREFER_CMOV"),
    
    REQUIREPAT(36, "REQUIRE_PAT"),
    
    PREFERPAT(37, "PREFER_PAT"),
    
    REQUIREPSE36(38, "REQUIRE_PSE36"),
    
    PREFERPSE36(39, "PREFER_PSE36"),
    
    REQUIRECLFLUSH(40, "REQUIRE_CLFLUSH"),
    
    PREFERCLFLUSH(41, "PREFER_CLFLUSH"),
    
    REQUIREDTS(42, "REQUIRE_DTS"),
    
    PREFERDTS(43, "PREFER_DTS"),
    
    REQUIREACPI(44, "REQUIRE_ACPI"),
    
    PREFERACPI(45, "PREFER_ACPI"),
    
    REQUIREMMX(46, "REQUIRE_MMX"),
    
    PREFERMMX(47, "PREFER_MMX"),
    
    REQUIREFXSR(48, "REQUIRE_FXSR"),
    
    PREFERFXSR(49, "PREFER_FXSR"),
    
    REQUIRESSE(50, "REQUIRE_SSE"),
    
    PREFERSSE(51, "PREFER_SSE"),
    
    REQUIRESSE2(52, "REQUIRE_SSE2"),
    
    PREFERSSE2(53, "PREFER_SSE2"),
    
    REQUIRESS(54, "REQUIRE_SS"),
    
    PREFERSS(55, "PREFER_SS"),
    
    REQUIREHT(56, "REQUIRE_HT"),
    
    PREFERHT(57, "PREFER_HT"),
    
    REQUIRETM(58, "REQUIRE_TM"),
    
    PREFERTM(59, "PREFER_TM"),
    
    REQUIREIA64(60, "REQUIRE_IA64"),
    
    PREFERIA64(61, "PREFER_IA64"),
    
    REQUIREPBE(62, "REQUIRE_PBE"),
    
    PREFERPBE(63, "PREFER_PBE"),
    
    REQUIRERDTSCP(64, "REQUIRE_RDTSCP"),
    
    PREFERRDTSCP(65, "PREFER_RDTSCP"),
    
    REQUIREPNI(66, "REQUIRE_PNI"),
    
    PREFERPNI(67, "PREFER_PNI"),
    
    REQUIREPCLMULQDQ(68, "REQUIRE_PCLMULQDQ"),
    
    PREFERPCLMULQDQ(69, "PREFER_PCLMULQDQ"),
    
    REQUIREDTES64(70, "REQUIRE_DTES64"),
    
    PREFERDTES64(71, "PREFER_DTES64"),
    
    REQUIREMONITOR(72, "REQUIRE_MONITOR"),
    
    PREFERMONITOR(73, "PREFER_MONITOR"),
    
    REQUIREDSCPL(74, "REQUIRE_DS_CPL"),
    
    PREFERDSCPL(75, "PREFER_DS_CPL"),
    
    REQUIREVMX(76, "REQUIRE_VMX"),
    
    PREFERVMX(77, "PREFER_VMX"),
    
    REQUIRESMX(78, "REQUIRE_SMX"),
    
    PREFERSMX(79, "PREFER_SMX"),
    
    REQUIREEST(80, "REQUIRE_EST"),
    
    PREFEREST(81, "PREFER_EST"),
    
    REQUIRETM2(82, "REQUIRE_TM2"),
    
    PREFERTM2(83, "PREFER_TM2"),
    
    REQUIRESSSE3(84, "REQUIRE_SSSE3"),
    
    PREFERSSSE3(85, "PREFER_SSSE3"),
    
    REQUIRECID(86, "REQUIRE_CID"),
    
    PREFERCID(87, "PREFER_CID"),
    
    REQUIREFMA(88, "REQUIRE_FMA"),
    
    PREFERFMA(89, "PREFER_FMA"),
    
    REQUIRECX16(90, "REQUIRE_CX16"),
    
    PREFERCX16(91, "PREFER_CX16"),
    
    REQUIREXTPR(92, "REQUIRE_XTPR"),
    
    PREFERXTPR(93, "PREFER_XTPR"),
    
    REQUIREPDCM(94, "REQUIRE_PDCM"),
    
    PREFERPDCM(95, "PREFER_PDCM"),
    
    REQUIREPCID(96, "REQUIRE_PCID"),
    
    PREFERPCID(97, "PREFER_PCID"),
    
    REQUIREDCA(98, "REQUIRE_DCA"),
    
    PREFERDCA(99, "PREFER_DCA"),
    
    REQUIRESSE41(100, "REQUIRE_SSE4_1"),
    
    PREFERSSE41(101, "PREFER_SSE4_1"),
    
    REQUIRESSE42(102, "REQUIRE_SSE4_2"),
    
    PREFERSSE42(103, "PREFER_SSE4_2"),
    
    REQUIREX2APIC(104, "REQUIRE_X2APIC"),
    
    PREFERX2APIC(105, "PREFER_X2APIC"),
    
    REQUIREMOVBE(106, "REQUIRE_MOVBE"),
    
    PREFERMOVBE(107, "PREFER_MOVBE"),
    
    REQUIREPOPCNT(108, "REQUIRE_POPCNT"),
    
    PREFERPOPCNT(109, "PREFER_POPCNT"),
    
    REQUIRETSCDEADLINETIMER(110, "REQUIRE_TSC_DEADLINE_TIMER"),
    
    PREFERTSCDEADLINETIMER(111, "PREFER_TSC_DEADLINE_TIMER"),
    
    REQUIREXSAVE(112, "REQUIRE_XSAVE"),
    
    PREFERXSAVE(113, "PREFER_XSAVE"),
    
    REQUIREAVX(114, "REQUIRE_AVX"),
    
    PREFERAVX(115, "PREFER_AVX"),
    
    REQUIREF16C(116, "REQUIRE_F16C"),
    
    PREFERF16C(117, "PREFER_F16C"),
    
    REQUIRERDRAND(118, "REQUIRE_RDRAND"),
    
    PREFERRDRAND(119, "PREFER_RDRAND"),
    
    REQUIREFSGSBASE(120, "REQUIRE_FSGSBASE"),
    
    PREFERFSGSBASE(121, "PREFER_FSGSBASE"),
    
    REQUIREBMI1(122, "REQUIRE_BMI1"),
    
    PREFERBMI1(123, "PREFER_BMI1"),
    
    REQUIREHLE(124, "REQUIRE_HLE"),
    
    PREFERHLE(125, "PREFER_HLE"),
    
    REQUIREAVX2(126, "REQUIRE_AVX2"),
    
    PREFERAVX2(127, "PREFER_AVX2"),
    
    REQUIRESMEP(128, "REQUIRE_SMEP"),
    
    PREFERSMEP(129, "PREFER_SMEP"),
    
    REQUIREBMI2(130, "REQUIRE_BMI2"),
    
    PREFERBMI2(131, "PREFER_BMI2"),
    
    REQUIREERMS(132, "REQUIRE_ERMS"),
    
    PREFERERMS(133, "PREFER_ERMS"),
    
    REQUIREINVPCID(134, "REQUIRE_INVPCID"),
    
    PREFERINVPCID(135, "PREFER_INVPCID"),
    
    REQUIRERTM(136, "REQUIRE_RTM"),
    
    PREFERRTM(137, "PREFER_RTM"),
    
    REQUIREMPX(138, "REQUIRE_MPX"),
    
    PREFERMPX(139, "PREFER_MPX"),
    
    REQUIRERDSEED(140, "REQUIRE_RDSEED"),
    
    PREFERRDSEED(141, "PREFER_RDSEED"),
    
    REQUIREADX(142, "REQUIRE_ADX"),
    
    PREFERADX(143, "PREFER_ADX"),
    
    REQUIRESMAP(144, "REQUIRE_SMAP"),
    
    PREFERSMAP(145, "PREFER_SMAP")
    ;

    private static final Map<String, CpuFeatureType> NAME_MAP;
    private static final Map<Integer, CpuFeatureType> VALUE_MAP;

    static {
        final Builder<String, CpuFeatureType> nb = ImmutableMap.builder();
        final Builder<Integer, CpuFeatureType> vb = ImmutableMap.builder();
        for (CpuFeatureType enumItem : CpuFeatureType.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private CpuFeatureType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getIntValue() {
        return value;
    }

    /**
     * Return the enumeration member whose {@link #getName()} matches specified value.
     *
     * @param name YANG assigned name
     * @return corresponding CpuFeatureType item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<CpuFeatureType> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding CpuFeatureType item, or null if no such item exists
     */
    public static CpuFeatureType forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
