package ns.topology;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.String;
import java.util.Objects;

import ns.yang.ietf.inet.types.rev100924.Uri;

public class TpId extends Uri implements Serializable {
	private static final long serialVersionUID = -9043341782189787883L;

	@ConstructorProperties("value")
	public TpId(String _value) {
		super(_value);

		Objects.requireNonNull(_value, "Supplied value may not be null");

	}

	/**
	 * Creates a copy from Source Object.
	 *
	 * @param source Source object
	 */
	public TpId(TpId source) {
		super(source);
	}

	/**
	 * Creates a new instance from Uri
	 *
	 * @param source Source object
	 */
	public TpId(Uri source) {
		super(source);
	}

	public static TpId getDefaultInstance(String defaultValue) {
		return new TpId(defaultValue);
	}

}
