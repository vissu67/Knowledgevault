package com.openkm.extension.frontend.client.util;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class OKMExtensionBundleExampleResources_default_InlineClientBundleGenerator implements com.openkm.extension.frontend.client.util.OKMExtensionBundleExampleResources {
  public com.google.gwt.resources.client.ImageResource box() {
    return box;
  }
  public com.google.gwt.resources.client.ImageResource general() {
    return general;
  }
  private void _init0() {
    box = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "box",
    externalImage,
    0, 0, 16, 16, false, false
  );
    general = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "general",
    externalImage0,
    0, 0, 40, 40, false, false
  );
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAG9SURBVDjLpZO9apRREIafDVuIhMjGhPwJukashNjoNdgIqQQbG8U7ECy0i4UXIMQLEKxtrCwsRMRKbBSCoBhQwRjwZ3e/M/O+FufbTYRYZWA45wznnXk4Z6Zjm8PYFIe0LsDDG/1pm03jy5gpAzbIxga3q2wMv2Q/uPXo8wZAZ/P6qVmbrd7iyd7cUh86HWhFMvvcpKBE4fv2B358+7Rx+/H23a7Nq+PL/d7c8ipf3r+kjH6jhDSkTAjCRoISZmbhNDMLq4S4c+/K8rmu8fzahYu8fvaEwc+dKm5FIZMJIVMSIsXu1ltmhw1nzq6x8/XjeteG+ZVF1q/dRKMhVqBInElG4igoApXxPlEJpo4t8eaF6drgEIPdd6j5g0KoqCYpSRShkq0LlZps+ugJZOjWxxEuSQ6zVohETZIh1LTiNqYQGTVmtwQqiUZBjgKVICfVsj0Ll7GwpYvcI1AkOSyUYTkQN4twCjWB0jgryYTAjYhRkIPyH1zVilETOV19QlCSHAQ5bA7GTaEUDuFxZ9EmsCGLOLJyvv5AGmvvstVWlGt/7zNjOvevrjy1uST90+8Hz4HBVYkrwfPOYcf5L9lR/9+EMK8xAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAYAAACM/rhtAAAAAXNSR0IArs4c6QAAAAZiS0dEAP8A/wD/oL2nkwAAAAlwSFlzAAAN1wAADdcBQiibeAAAAAd0SU1FB9kFDwggIMmfLbMAAAyeSURBVFjD7ZhZbFzndcd/d5t776wcckiRFBlR+xJLlrzIkmUrieMsrutuQQM0hQM07UNbJ34p4ObR6EPRJa1hBG3R5cmw3RY2Urfwi2NHttRoMW1JpiTKkiiS4joczpCz3Jk7d/2+PnBkyY4kt07Rh6AfcHBnBvfi++F/zvl/dw78//oFX8rP8+zBg08ftJLWr6m69mUFMWSaCRUwpcT3vCCOJbMijN6MguDfT5784ej/CeAXv/iHaanYTyfMxFObd29P79izJTO8YUBxvIjVehM/CMl3ZUmnLFqOS3GmKKfOX6rOTs62Qj/6U0PL/dM77zwb/a8CSik1QH/ssWd+Syj6nz36K1/qKmwYNDXDZHphldPnJ0nZBqahISVous7++3bhtEOQAl0FwoDxU2ebE2c/XBVB8NRPf/r86z83oJTSBgYbjXbPD/7qlT9JF7oP3394n33mcpFQaOzcNoyd0Dg7NkG11sBK6CgKrB/spVDIU20FlOtt2l6I70eIOMAQEeNvn6yXF0ovDfTNPv3KK6/EnwlQSpkGNi8slLf/6LUTfz6yc/NQrOl60xP0D/Ry/soCrh/y9Yfv4uR7FzE02DjUS3c+QxAJGi0fXyjUnYBcUsNSAj7Xl0VKSRhLpqcXo9FjY5e9VnT4ued+b/WzAO6M43jHiy8deX7XPTuHYkVRMpk0iqYzu1RFKhqfG+zD0CTTM4sMFDL0dadRgJW6i0ShK53A0lWOvD/FW+9OoCQzjJ27iqqpDPdm2NiXFv7c3FXi/N7nnvtm+1Yc+i3AFGAIWP/P/3L0j7fv2TY4uC6nrOtOEwmYKtZZWCxjWja7Ng9gqLBv5zCmJslaKgpQSGfxQsHVxQaX5utcmm9Q8wT9OR1VVQj8kCuzFWpNT00riY3Fs+/+PfDtWwGqt/htH7D+xRd/8mimJ7/XTlva+t4MuqZgGQrre2wef3ArD+8eIKX4dFmQMxUypvpROjR17VMyoaJGPq2Wi5SSc+evEseikzeF0oqDpxpGYl3/rx848N3HbgWofUK9QWDPsWPnJj6cKP7dvQc+n83YBvmMhaIoSAnnJkrMVVxcodHyQUuYCAmWDh0uYiEpN0PaXoyhS+7b2sf+Hf1kUgkWK01cL0QiERLqTY/ewZ5Ee7X2cC75lb8tl9+J75TiHUDxrSNj37/7oX3dF6eWSRgajuszUMhSqbWo1Nug6Yz0dgMKmgo5E1ohaIpEARwvwvUFcxWHN/5znOKKS63R4sBdwzzz5CEUFF7+8TlOXZhHCEnV8TCHhwey/uQfAM/fCVDxvEg/Mzb9RG77VrVad+nvSROEMVOLNWzLZOPIIMlkkiBeU63LhLLbUU9CFMf4oaC04nBs9BLJVIoHt21mfqHCpcUyx8dPYOvw5GN7+Z1f3sdfv3yCC1MlRtZlDd/Qnvkk4MdS/Oyzz/a//faZJ4pufLjohEbLC4mFwA9jWl7I/Xu3Yds2oQBbh5wFiw7EEiQQRgI/FLi+wA0FKzUPoWksLdewkha9hTyZdIpQqrxzdppjZ6b4o28dYrCQ4dzVJXRVVYe6dh6Zmxudv12TfJDvzn2je2Bdcnm1yfxynZmlOvPLDju2b0QoOl4EpgZZC+YaEMRr4QWSViBw2jENL2LV8Xnv/DTHTl3kzPmrnHx3nMVimfnFZRQUNFVlqeLw3R+8TqXu8u1f2oeVz6UE6jdv28WKorQnpxZ71g/kCYVkx5ZhHj64h+5CN3YyjeNFGIog34GTcu25MJI0vIh6K6LWjqjUPf7tjfeoOe7aPRKCMGT80jXmF8pcmbhGo9ECRUFIeP3kJGevLPHlgzsQivq1O9rMa/9xSh7aM8y9u7dw6P7tbBzs5pEHtmOoElOT9KbgSjnEDyKCMMYPItr+2ncvjPCDiPOXZimV60gpO8FHARLZOSK6C90gJZEfMnqpiFCgO5/uu22TPPDA97JuIHj/0iKPH9jA5KJDl5klmTBIGAqbCwZTlQAvEEipoCggJMSxIIxiwijGD2NmF8pIuWYja9frkDeunhdgWjGKqhCFMY26w4WrRfr7uxK3VVCIOJnQVdnwJMQhfRmVhCZJWyobekxWnJAoiiCOaXshrhfS9gLafojnh3hBhOcHlMq1DtTPxs2wjYZDKpsFRZJJ27TaHuVyPT506JnMLRUUImqDwtBAgUpb4eCO9TRdj4FCEqTkcqWOYdprisWCMOpsKiSREERRTBDFdOVSNF0PIdaAxM+ouBZhEILiY5kJLENFQ9AOQo4f/wvnlgqePv0PDUXGiq6BldAoNXw2DuSxEyq2qaERMTY+ydXpRaIwwvUCXC/E9QPaXthRMmLXjo3ohoaQAiFupFl8QkUhJZ7bIvB9VGJ6u5K4rhfdyail74euiEU+igUi/vj7TkJfs83Z+WWmi1VGRoaQgBSSWEiiOCaKBbqusfeubVTrDolEAi8ImZxawGm5aw3CjeZBSmxbZ7g3Q6vZIozi1Tu+zQR+8P5qubq+qzeP0w4II0EcC/wgopBLIoTAcT2miyUqdY+tm4bQNJVYiDXIKCaMBZZt0q1rBGGMltDJZy0ylgYqiFjiBSFN18cP4HN9GTKWzuJ0ERBH7wjYrDdfmp6Y+eq2TNoGyXLd4/3xOVwvQFXg4b0jBFHM2ESJSm2GK5MLjGzoZ+PIAELwEeD1rtYVhaRlsGWkn0a1hqYqxELg+RFN18OydLYN5hj94DLRaqMmI+WV2x51AJs27ZxaKbtPbdy9M7VlMMfUksPEzDKlFYfZpTpHzkwx1Jvlawe3MrVQZbXeZrXWZP1gH0G45o3XQ1MhZemkLZ20ZZA0IJe2yKRMkqZO0jI4vHcDZ8anIAqpXitWT57o+R68I28LeO3aB1H/wP5e1U7df2DfiPaTD+bxQsnVmRLL1RYLZYfRiwt8eK3MN760i7u39qMYJrGiE0Q34OJYkDJ10rZOxjboypikTZWenE0maZC2E+z//BBTc8t4rktQa4S15dUfzs3+5ZE7KgjQ23PX8Xpl9TsPHL43+9bZBZqBwGmHzCyUCYIYiaTVDjh1YZ75coMnHt7J5sEcrXZIpeHhhxGGrpIyNTK2QTaVIGfrDBVS3L2ln/6eNBv6u5hdqrFarWNqkvp8pbxlU99vnzr1hvepgMXi6bBv3d2Jbds2HC61pdZo+RhmAiElrWabTvMhJTRaPqUWFKtt1uWT7B7JYxsaugqappCydHK2wfqeJA/tGaY7l6Q3n0JVFOaLFTRF4ixXvXRS+8evfmXHiRdeeKF9xybprMzoib956dFH7/lOO05v1jPdmuuFSLlW4NedxzAM+gZ6kYrKctWluNpECElXKsH2oS4Ge1JkkjoZU2eoN42m3bDdfDZJytJxqrEwpJzftafnxMmTJ7uBGhDf6T+JAViANX/t1PdnRt9b1nwXQ1MQKMQdz4uFxDATaEaCthd8ZNauFzJXdhibWmbs6hJTcyus1JogxMc28YMQ4pig0Wpt3ZL+11qtZszMzOiA/WkpNjs32Rcvng+rlcXTasv4Qra3YBu2paxUbpyzqWwGqaiEUcdWwog4ChFRgEmMrUtyts7B3UOoCjRaHrZp4AUhlyfm5eJMyctmo9dctzFfKpUqR48eXVpYWGgD/p0A9Q6kKYQwPa8a1Vfn3jPD1D09uWTSyqS1OBLY2Qy6oSPiEBGFyCiEOEBGAUQBxBEP3jXE44e2ceHKApOzJRpOi6XlKlNXF+KlxbJj294bruvMVavV5bm5uaVXX311CfA+DTDupNnowOpB4ISV5YunHrrnvuHStaXubHdW7+/NKjIOCQMfGa6ByShAExH7dw7w+7+xn7bb5kc/fp9Ws0VCUwhabbmyuBp5Xn3C0JyjzWZjqVarLZVKpcXjx4/PzM7O1oE2EN2xiwHRqU/1+mkcRaHI5dTZb/3mo3Hx8jW5dGUmpRPRlU5o3TmL3ZsKfP3AVn73V+9HFTEvv36SC5evYUQRfs0J68WVqFWvTCNX3pLCGW+1Wsv1er1YKpXmx8fHZ958880loAm0/rvDIwPIAplOpIHUI488Mvzkk0/u37Rp8zYpzQ2KmuhTVc2enS3LCxen49HTV2QUBkKEQg2CIPJ9Zy5ptc/n8+HlQqE7yOVyYSKRcIUQDcdxymNjY4ujo6PLgNMB/B+P31IdwBSQ7IR9vdOBBGBommWlUvmMphlmEPiB56024jgMgBAINE0LhoaGZKFQCBVFaVWr1frk5GSto5hzc1o/6wDT/gSc2Ynrtap9omREJ6LrkJ3i9zt11u7Afbbx26cs4yZA/SbAm31VdjaPb4L0OqDiF2aI/l/gfz9AupbE0gAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource box;
  private static com.google.gwt.resources.client.ImageResource general;
  
  static {
    new OKMExtensionBundleExampleResources_default_InlineClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      box(), 
      general(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("box", box());
        resourceMap.put("general", general());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'box': return this.@com.openkm.extension.frontend.client.util.OKMExtensionBundleExampleResources::box()();
      case 'general': return this.@com.openkm.extension.frontend.client.util.OKMExtensionBundleExampleResources::general()();
    }
    return null;
  }-*/;
}
