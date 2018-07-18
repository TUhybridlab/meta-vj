include recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += " \
  openssh \
"
IMAGE_LINGUAS = "en-us"

set_ip_address() {
   sed -i 's/##IP_FINAL_TUPLE##/${IP_FINAL_TUPLE}/g' ${IMAGE_ROOTFS}/etc/network/interfaces;
}

ROOTFS_POSTPROCESS_COMMAND_append = " \
  set_ip_address; \
"
