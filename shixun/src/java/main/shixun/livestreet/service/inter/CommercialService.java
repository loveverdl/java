package shixun.livestreet.service.inter;

import java.util.List;

import shixun.livestreet.db.pojo.Coupon;
import shixun.livestreet.db.pojo.Picture;
import shixun.livestreet.pojo.CommercialDetail;
import shixun.livestreet.pojo.PictureDetail;

public interface CommercialService {

	public void publishCoupon(Coupon coupon);

	public CommercialDetail getDetail(int commercialId);

	public List<PictureDetail> getPictureSetDetail(int pictureSetId);

	/**
	 * 
	 * @param objects
	 *            可以添加地域信息<tt>Region</tt>，预算信息<tt>Budget</tt>，类别信息
	 *            <tt>TypeOfCommercial</tt>， 设施信息<tt>FacilityNeeded</tt>，综合信息
	 *            <tt>String</tt>
	 * @return
	 */
	public List<CommercialDetail> filterCommercial(Object... objects);
}
